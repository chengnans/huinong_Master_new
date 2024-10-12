import request from '@/utils/request'

// 查询产业价格管理列表
export function listIndustrial_price(query) {
  return request({
    url: '/system/industrial_price/list',
    method: 'get',
    params: query
  })
}

// 查询产业价格管理详细
export function getIndustrial_price(id) {
  return request({
    url: '/system/industrial_price/' + id,
    method: 'get'
  })
}

// 新增产业价格管理
export function addIndustrial_price(data) {
  return request({
    url: '/system/industrial_price',
    method: 'post',
    data: data
  })
}

// 修改产业价格管理
export function updateIndustrial_price(data) {
  return request({
    url: '/system/industrial_price',
    method: 'put',
    data: data
  })
}

// 删除产业价格管理
export function delIndustrial_price(id) {
  return request({
    url: '/system/industrial_price/' + id,
    method: 'delete'
  })
}
