import request from '@/utils/request'

// 查询员工管理列表
export function listEmployee_manage(query) {
  return request({
    url: '/system/employee_manage/list',
    method: 'get',
    params: query
  })
}

// 查询员工管理详细
export function getEmployee_manage(id) {
  return request({
    url: '/system/employee_manage/' + id,
    method: 'get'
  })
}

// 新增员工管理
export function addEmployee_manage(data) {
  return request({
    url: '/system/employee_manage',
    method: 'post',
    data: data
  })
}

// 修改员工管理
export function updateEmployee_manage(data) {
  return request({
    url: '/system/employee_manage',
    method: 'put',
    data: data
  })
}

// 删除员工管理
export function delEmployee_manage(id) {
  return request({
    url: '/system/employee_manage/' + id,
    method: 'delete'
  })
}
