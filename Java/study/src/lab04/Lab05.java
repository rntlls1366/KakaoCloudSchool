package lab04;

abstract class 통신사 {
    public static Phone[] phones = new Phone[10];
    public static int phoneCount = 0;

    public boolean call(String Phonenumber) {
        for(int i = 0; i < phoneCount; i++) {
            if(phones[i].ownerPhoneNumber.equals(Phonenumber) && phones[i].status == Phone.IDLE) {
                phones[i].status = Phone.BUSY;
                return true;
            }
        }
        return false;
    }

}

abstract class Phone {
    static final int BUSY = 1;
    static final int IDLE = 2;
    static final int POWEROFF = 3;
    int status = IDLE;
    String ownerPhoneNumber;
    String owner;
    통신사 c;

    Phone(String ownerPhoneNumber, String owner, 통신사 c) {
        this.owner = owner;
        this.ownerPhoneNumber = ownerPhoneNumber;
        this.c = c;
    }

    public abstract void call(String Phonenumber);
}

class SKT extends 통신사 {
    @Override
    public boolean call(String Phonenumber) {
       if(super.call(Phonenumber)) {
           System.out.println("SKT로 통화 성공");
           return true;
       }
       else {
           System.out.println("SKT로 통화 시도 하였으나, 통화 실패");
           return false;
       }
    }
}

class KT extends 통신사 {
    @Override
    public boolean call(String Phonenumber) {
        if(super.call(Phonenumber)) {
            System.out.println("KT로 통화 성공");
            return true;
        }
        else {
            System.out.println("KT로 통화 시도 하였으나, 통화 실패");
            return false;
        }
    }
}

class iPhone extends Phone {
    iPhone(String ownerPhoneNumber, String owner, 통신사 c) {
        super(ownerPhoneNumber, owner, c);
    }

    @Override
    public void call(String Phonenumber) {
        if(c.call(Phonenumber)) status = BUSY;
    }
}

class GalaxyNote extends Phone {
    GalaxyNote(String ownerPhoneNumber, String owner, 통신사 c) {
        super(ownerPhoneNumber, owner, c);
    }

    @Override
    public void call(String Phonenumber) {
        if(c.call(Phonenumber)) status = BUSY;
    }
}

public class Lab05 {

    public static void main(String[] args) {
        SKT skt = new SKT();
        KT kt = new KT();

        Phone  류승룡phone = new iPhone("111-222-3333", "류승룡", skt);
        Phone  이하늬phone = new iPhone("222-222-4444", "이하늬", kt);
        Phone  하지원phone = new GalaxyNote("555-555-5555", "하지원", kt);
        Phone  윤여정phone = new GalaxyNote("777-777-1111", "윤여정", kt);
        Phone  조은phone = new GalaxyNote("777-777-2222", "조은", skt);
        Phone  서장훈phone = new iPhone("777-777-3333", "서장훈", skt);

        통신사.phones[통신사.phoneCount++] = 류승룡phone ;
        통신사.phones[통신사.phoneCount++] = 이하늬phone;
        통신사.phones[통신사.phoneCount++] = 하지원phone;
        통신사.phones[통신사.phoneCount++] = 윤여정phone;
        통신사.phones[통신사.phoneCount++] = 조은phone;
        통신사.phones[통신사.phoneCount++] = 서장훈phone ;

        류승룡phone.call(이하늬phone.ownerPhoneNumber);
        윤여정phone.call(조은phone.ownerPhoneNumber);
        조은phone.call(류승룡phone.ownerPhoneNumber);
        서장훈phone.call(하지원phone.ownerPhoneNumber);
        하지원phone.call(윤여정phone.ownerPhoneNumber);

    }
}
