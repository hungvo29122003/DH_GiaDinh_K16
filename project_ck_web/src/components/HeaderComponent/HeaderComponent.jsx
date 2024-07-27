import React from "react";
import { Badge, Col } from 'antd';
import { WrapperHeader, WrapperHeaderAccout, WrapperTextHeader, WrapperTextHeaderSmall } from "./Style";
import Search from "antd/es/transfer/search";
import {
  UserOutlined,
  CaretDownOutlined,
  ShoppingCartOutlined,
} from '@ant-design/icons';
import ButtonInputSearch from "../ButtonInputSearch/ButtonInputSearch";
const HeaderComponent = () => {
  return (
    <WrapperHeader gutter={16}>
      <Col span={6}>
        <WrapperTextHeader>Project cuối kì web</WrapperTextHeader>
      </Col>
      <Col span={12}>
        <ButtonInputSearch
          size="large"
          textButton="Tìm kiếm"
          placeholder="input search text"

        //allowClear
        // enterButton="Search"
        // size="large"
        //onSearch={onSearch}
        />
      </Col>
      <Col span={6} style={{ display: 'flex', gap: '20px', alignItems: 'center' }} >
        <WrapperHeaderAccout>
          <UserOutlined style={{ fontSize: '30px' }} />
          <div>
            <WrapperTextHeaderSmall >Đăng nhập/ Đăng kí</WrapperTextHeaderSmall>
            <div>
              <WrapperTextHeaderSmall>Tài khoản</WrapperTextHeaderSmall>
              <CaretDownOutlined />
            </div>
          </div>
        </WrapperHeaderAccout>
        <div>
          <Badge count={4} size="small">
            <ShoppingCartOutlined style={{ fontSize: '25px', color: '#fff' }} />
          </Badge>
          <WrapperTextHeaderSmall>Giỏ hàng</WrapperTextHeaderSmall>
        </div>
      </Col>
    </WrapperHeader>

  )
}

export default HeaderComponent