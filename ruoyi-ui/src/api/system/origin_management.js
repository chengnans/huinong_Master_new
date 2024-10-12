import request from '@/utils/request'

// 查询产地管理列表
export function listOrigin_management(query) {
  return request({
    url: '/system/origin_management/list',
    method: 'get',
    params: query
  })
}

// 查询产地管理详细
export function getOrigin_management(id) {
  return request({
    url: '/system/origin_management/' + id,
    method: 'get'
  })
}

// 新增产地管理
export function addOrigin_management(data) {
  return request({
    url: '/system/origin_management',
    method: 'post',
    data: data
  })
}

// 修改产地管理
export function updateOrigin_management(data) {
  return request({
    url: '/system/origin_management',
    method: 'put',
    data: data
  })
}

// 删除产地管理
export function delOrigin_management(id) {
  return request({
    url: '/system/origin_management/' + id,
    method: 'delete'
  })
}
