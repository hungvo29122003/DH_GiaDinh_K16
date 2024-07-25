import { Button } from "antd";
import InputComponents from "../InputComponents/InputComponents";
import React from "react";
import { SearchOutlined } from '@ant-design/icons';

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
            <Button
                size={size}
                style={{
                    borderRadius: 2,
                    background: backgroundColorButton,
                    color: colorButton,
                    border: !bordered && 'none'
                }}
                icon={<SearchOutlined />}
            >
                <span>{textButton}</span>
            </Button>
        </div>
    );
};

export default ButtonInputSearch;
