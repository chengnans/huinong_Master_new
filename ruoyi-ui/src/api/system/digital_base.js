import request from '@/utils/request'

// 查询基地信息列表
export function listDigital_base(query) {
  return request({
    url: '/system/digital_base/list',
    method: 'get',
    params: query
  })
}

// 查询基地信息详细
export function getDigital_base(id) {
  return request({
    url: '/system/digital_base/' + id,
    method: 'get'
  })
}

// 新增基地信息
export function addDigital_base(data) {
  return request({
    url: '/system/digital_base',
    method: 'post',
    data: data
  })
}

// 修改基地信息
export function updateDigital_base(data) {
  return request({
    url: '/system/digital_base',
    method: 'put',
    data: data
  })
}

// 删除基地信息
export function delDigital_base(id) {
  return request({
    url: '/system/digital_base/' + id,
    method: 'delete'
  })
}
