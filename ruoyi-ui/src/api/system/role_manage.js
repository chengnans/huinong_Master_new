import request from '@/utils/request'

// 查询角色管理列表
export function listRole_manage(query) {
  return request({
    url: '/system/role_manage/list',
    method: 'get',
    params: query
  })
}

// 查询角色管理详细
export function getRole_manage(id) {
  return request({
    url: '/system/role_manage/' + id,
    method: 'get'
  })
}

// 新增角色管理
export function addRole_manage(data) {
  return request({
    url: '/system/role_manage',
    method: 'post',
    data: data
  })
}

// 修改角色管理
export function updateRole_manage(data) {
  return request({
    url: '/system/role_manage',
    method: 'put',
    data: data
  })
}

// 删除角色管理
export function delRole_manage(id) {
  return request({
    url: '/system/role_manage/' + id,
    method: 'delete'
  })
}
