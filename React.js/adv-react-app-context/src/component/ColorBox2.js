import React, { useContext } from 'react';
import ColorContext from '../context/color2';

export default function ColorBox2() {
    const { state } = useContext(ColorContext);

    return (
        <>
            <div
                style= {{
                    width: '64px',
                    heigth: '64px',
                    background: state.color
                }}
            />
            <div 
                style={{
                    width:'32px',
                    height: '32px',
                    background: state.subcolor
                }}
            />
        </>
    )
}