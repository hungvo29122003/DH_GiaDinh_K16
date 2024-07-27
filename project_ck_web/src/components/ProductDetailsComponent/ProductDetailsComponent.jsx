import { Col, Image, InputNumber, Row } from "antd";
import React from "react";
import imgLenovoThinkPad from '../../accest/img1.webp'
import imgThinkPandSmall1 from '../../accest/thinkPadSmall1.webp'
import imgThinkPandSmall2 from '../../accest/thinkPadSmall2.webp'
import imgThinkPandSmall3 from '../../accest/thinkPadSmall3.webp'
import imgThinkPandSmall4 from '../../accest/thinkPadSmall4.webp'
import imgThinkPandSmall5 from '../../accest/thinkPadSmall5.webp'
import imgThinkPandSmall6 from '../../accest/thinkPadSmall6.webp'
import { WrapperAddressProduct, WrapperBtnQualityProduct, WrapperInputNumber, WrapperPriceProduct, WrapperPriceTextProduct, WrapperQualityProduct, WrapperStyleColImage, WrapperStyleImageSmall, WrapperStyleNameProduct, WrapperStyleTextSell } from "./style";
import { StarFilled, PlusOutlined, MinusOutlined } from '@ant-design/icons'
import ButtonComponents from "../ButtonComponents/ButtonComponents";
const ProductDetailsComponent = () => {
    const onChange = () => { }
    return (
        <Row style={{ padding: '16px', background: '#fff' }}>
            <Col span={10}>
                <Image src={imgLenovoThinkPad} alt="LenovoThinkPad" preview={false} />
                <Row style={{ paddingTop: '10px', justifyContent: 'space-between', }}>
                    <WrapperStyleColImage span={4}>
                        <WrapperStyleImageSmall src={imgThinkPandSmall1} alt="LenovoThinkPadSmall1" preview={false} />
                    </WrapperStyleColImage>
                    <WrapperStyleColImage span={4}>
                        <WrapperStyleImageSmall src={imgThinkPandSmall2} alt="LenovoThinkPadSmall2" preview={false} />
                    </WrapperStyleColImage>
                    <WrapperStyleColImage span={4}>
                        <WrapperStyleImageSmall src={imgThinkPandSmall3} alt="LenovoThinkPadSmall3" preview={false} />
                    </WrapperStyleColImage>
                    <WrapperStyleColImage span={4}>
                        <WrapperStyleImageSmall src={imgThinkPandSmall4} alt="LenovoThinkPadSmall4" preview={false} />
                    </WrapperStyleColImage>
                    <WrapperStyleColImage span={4}>
                        <WrapperStyleImageSmall src={imgThinkPandSmall5} alt="LenovoThinkPadSmall5" preview={false} />
                    </WrapperStyleColImage>
                    <WrapperStyleColImage span={4}>
                        <WrapperStyleImageSmall src={imgThinkPandSmall6} alt="LenovoThinkPadSmall6" preview={false} />
                    </WrapperStyleColImage>
                </Row>
            </Col>
            <Col span={14}>
                <WrapperStyleNameProduct>Laptop Lenovo ThinkPad T14 Gen 5 21ML007GVA
                </WrapperStyleNameProduct>
                <div>
                    <StarFilled style={{ fontSize: '12px', color: 'rgb(253, 216, 54)' }} />
                    <StarFilled style={{ fontSize: '12px', color: 'rgb(253, 216, 54)' }} />
                    <StarFilled style={{ fontSize: '12px', color: 'rgb(253, 216, 54)' }} />
                    <StarFilled style={{ fontSize: '12px', color: 'rgb(253, 216, 54)' }} />
                    <WrapperStyleTextSell>| Đã bán 10+</WrapperStyleTextSell>
                </div>
                <WrapperPriceProduct>
                    <WrapperPriceTextProduct>15.000.000 đ</WrapperPriceTextProduct>
                </WrapperPriceProduct>
                <WrapperAddressProduct>
                    <span>Giao đến</span>
                    <span className="address"> Q. GV đường số 8 , Hồ Chí Minh</span> -
                    <span className="Change-address">Đổi địa chỉ</span>
                </WrapperAddressProduct>
                <div>
                    <div>số lượng</div>
                    <WrapperQualityProduct>
                        <MinusOutlined style={{ color: '#000', fontSize: '20px' }} />
                        <WrapperInputNumber min={1} max={10} defaultValue={3} onChange={onChange} size="small" />
                        <PlusOutlined style={{ color: '#000', fontSize: '20px' }} />
                    </WrapperQualityProduct>
                </div>
            </Col>
        </Row>
    )
}

export default ProductDetailsComponent