import { Card } from "antd";
import Meta from "antd/es/card/Meta";
import React from "react";
import { StyleNameProduct, WrapperCardStyle, WrapperDiscountText, WrapperPriceText, WrapperReportText } from "./style";
import { StarFilled, } from '@ant-design/icons'
const CardComponents = () => {
    return (
        <WrapperCardStyle
            hoverable
            // headStyle={{width: '200px', height: '200px'}}
            style={{ width: 200 }}
            styles={{header: { width: '200px', height: '200px' }, body: {padding: '10px'}}}
            cover={<img alt="example" src="https://os.alipayobjects.com/rmsportal/QBnOOoLaAfKPirc.png" />}
        >
            <StyleNameProduct>Laptop</StyleNameProduct>
            <WrapperReportText>
                <span style={{marginRight: '4px'}}>
                    <span>4.96</span> <StarFilled style={{ fontSize: '12px', color: 'yellow' }} />
                </span>
                <span> | Đã bán 1000+ </span>
            </WrapperReportText>
            <WrapperPriceText> 
                <span style={{marginRight: '8px'}}>15.000.000đ</span>
                <WrapperDiscountText>
                    -5% 
                </WrapperDiscountText>
            </WrapperPriceText>
        </WrapperCardStyle>
    )
}
export default CardComponents