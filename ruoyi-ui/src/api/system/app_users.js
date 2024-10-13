import request from '@/utils/request'

// 查询APP用户列表
export function listApp_users(query) {
  return request({
    url: '/system/app_users/list',
    method: 'get',
    params: query
  })
}

// 查询APP用户详细
export function getApp_users(id) {
  return request({
    url: '/system/app_users/' + id,
    method: 'get'
  })
}

// 新增APP用户
export function addApp_users(data) {
  return request({
    url: '/system/app_users',
    method: 'post',
    data: data
  })
}

// 修改APP用户
export function updateApp_users(data) {
  return request({
    url: '/system/app_users',
    method: 'put',
    data: data
  })
}

// 删除APP用户
export function delApp_users(id) {
  return request({
    url: '/system/app_users/' + id,
    method: 'delete'
  })
}
