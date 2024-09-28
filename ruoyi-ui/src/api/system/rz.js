import request from '@/utils/request'

// 查询软著列表
export function listRz(query) {
  return request({
    url: '/system/rz/list',
    method: 'get',
    params: query
  })
}

// 查询软著详细
export function getRz(id) {
  return request({
    url: '/system/rz/' + id,
    method: 'get'
  })
}

// 新增软著
export function addRz(data) {
  return request({
    url: '/system/rz',
    method: 'post',
    data: data
  })
}

// 修改软著
export function updateRz(data) {
  return request({
    url: '/system/rz',
    method: 'put',
    data: data
  })
}

// 删除软著
export function delRz(id) {
  return request({
    url: '/system/rz/' + id,
    method: 'delete'
  })
}
