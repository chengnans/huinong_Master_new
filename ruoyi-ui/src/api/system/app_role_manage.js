import request from '@/utils/request'

// 查询APP角色管理列表
export function listApp_role_manage(query) {
  return request({
    url: '/system/app_role_manage/list',
    method: 'get',
    params: query
  })
}

// 查询APP角色管理详细
export function getApp_role_manage(id) {
  return request({
    url: '/system/app_role_manage/' + id,
    method: 'get'
  })
}

// 新增APP角色管理
export function addApp_role_manage(data) {
  return request({
    url: '/system/app_role_manage',
    method: 'post',
    data: data
  })
}

// 修改APP角色管理
export function updateApp_role_manage(data) {
  return request({
    url: '/system/app_role_manage',
    method: 'put',
    data: data
  })
}

// 删除APP角色管理
export function delApp_role_manage(id) {
  return request({
    url: '/system/app_role_manage/' + id,
    method: 'delete'
  })
}
