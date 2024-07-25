import { Button } from "antd";
import InputComponents from "../InputComponents/InputComponents";
import React from "react";
import { SearchOutlined } from '@ant-design/icons';
import ButtonComponents from "../ButtonComponents/ButtonComponents";

const ButtonInputSearch = (props) => {
    const { size, placeholder, textButton, bordered,
        backgroundColorInput = '#fff',
        backgroundColorButton = 'rgb(13,92,182)',
        colorButton = '#fff',
    } = props;

    return (
        <div style={{ display: 'flex', borderRadius: 2 }}>
            <InputComponents
                size={size}
                placeholder={placeholder}
                variant="borderless"
                style={{
                    background: backgroundColorInput,
                    borderRadius: 2
                }}
            />
            <ButtonComponents
                size={size}
                styleButton={{
                    borderRadius: 2,
                    background: backgroundColorButton,
                    color: colorButton,
                    border: !bordered && 'none'
                }}
                icon={<SearchOutlined  color={colorButton} style={{color: '#fff'}}/>}
                textButton={textButton}
                styleTextButton={{color:colorButton}}
            />
        </div>
    );
};

export default ButtonInputSearch;
