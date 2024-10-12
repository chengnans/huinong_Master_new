import request from '@/utils/request'

// 查询产品列表列表
export function listProduction_list(query) {
  return request({
    url: '/system/production_list/list',
    method: 'get',
    params: query
  })
}

// 查询产品列表详细
export function getProduction_list(id) {
  return request({
    url: '/system/production_list/' + id,
    method: 'get'
  })
}

// 新增产品列表
export function addProduction_list(data) {
  return request({
    url: '/system/production_list',
    method: 'post',
    data: data
  })
}

// 修改产品列表
export function updateProduction_list(data) {
  return request({
    url: '/system/production_list',
    method: 'put',
    data: data
  })
}

// 删除产品列表
export function delProduction_list(id) {
  return request({
    url: '/system/production_list/' + id,
    method: 'delete'
  })
}
