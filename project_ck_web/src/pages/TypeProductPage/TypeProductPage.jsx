import React from "react";
import NavbarComponents from "../../components/NavbarComponents/NavbarComponents";
import CardComponents from "../../components/CarcComponents/CardComponents";
import { Col, Pagination, Row } from "antd";
import { WrapperNavbar, WrapperProducts } from "./style";

const TypeProductPage = () => {
    const onChange = () => { }
    return (
        <div style={{ padding: '0 120px', background: '#efefef' }}>
            <Row style={{ flexWrap: 'nowrap', paddingTop: '10px' }}>
                <WrapperNavbar span={4}>
                    <NavbarComponents />
                </WrapperNavbar>
                <Col span={20} >
                    <WrapperProducts >
                        <CardComponents />
                        <CardComponents />
                        <CardComponents />
                        <CardComponents />
                        <CardComponents />
                        <CardComponents />
                        <CardComponents />
                    </WrapperProducts>
                    <Pagination defaultCurrent={2} total={100} onChange={onChange} style={{ justifyContent: 'center', marginTop: '10px' }} />
                </Col>
            </Row>
        </div>
    )
}

export default TypeProductPage