import request from '@/utils/request'

// 查询基地授权列表
export function listBase_auth(query) {
  return request({
    url: '/system/base_auth/list',
    method: 'get',
    params: query
  })
}

// 查询基地授权详细
export function getBase_auth(id) {
  return request({
    url: '/system/base_auth/' + id,
    method: 'get'
  })
}

// 新增基地授权
export function addBase_auth(data) {
  return request({
    url: '/system/base_auth',
    method: 'post',
    data: data
  })
}

// 修改基地授权
export function updateBase_auth(data) {
  return request({
    url: '/system/base_auth',
    method: 'put',
    data: data
  })
}

// 删除基地授权
export function delBase_auth(id) {
  return request({
    url: '/system/base_auth/' + id,
    method: 'delete'
  })
}
