import React, { Component } from 'react';
import ColorContext, { ColorConsumer } from '../context/color2';

const colors = ['red', 'orange', 'yellow', 'green', 'blue', 'indigo', 'violet'];

export default function  SelectColors()  {
   
    return (
      <div>
        <h2>색상을 선택하세요.</h2>
        
        <ColorConsumer> 
        {({ actions }) => ( 
        <div style={{ display: 'flex' }}>
          {colors.map(color => (
            <div
              key={color}
              style={{
                background: color,
                width: '24px',
                height: '24px',
                cursor: 'pointer'
              }}
              // 마우스 왼쪽 클릭 시 실행 
              onClick={   () => actions.setColor(color)   }   
              // 마우스 오른쪽 클릭 시 실행 
              onContextMenu={e => {
                e.preventDefault();
                actions.setSubcolor (color);
              }}
            />
          ))}
        </div>
        )} 

        </ColorConsumer>
        <hr />
      </div>
    );
  
}