import request from '@/utils/request'

// 查询部门管理列表
export function listDepartment_manage(query) {
  return request({
    url: '/system/department_manage/list',
    method: 'get',
    params: query
  })
}

// 查询部门管理详细
export function getDepartment_manage(id) {
  return request({
    url: '/system/department_manage/' + id,
    method: 'get'
  })
}

// 新增部门管理
export function addDepartment_manage(data) {
  return request({
    url: '/system/department_manage',
    method: 'post',
    data: data
  })
}

// 修改部门管理
export function updateDepartment_manage(data) {
  return request({
    url: '/system/department_manage',
    method: 'put',
    data: data
  })
}

// 删除部门管理
export function delDepartment_manage(id) {
  return request({
    url: '/system/department_manage/' + id,
    method: 'delete'
  })
}
