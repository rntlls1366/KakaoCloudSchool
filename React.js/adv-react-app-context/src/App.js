import React from 'react';
// import ColorBox from './component/ColorBox';
import ColorBox2 from './component/ColorBox2';
import SelectColors from './component/SelectColors';
import { ColorProvider } from './context/color2';
function App_ContextEx2_ColorBox  () {
  return ( 
    <ColorProvider>
      <div> 
        <SelectColors/>
        <ColorBox2 />
      </div> 
    </ColorProvider>
  );
};

export default App_ContextEx2_ColorBox;