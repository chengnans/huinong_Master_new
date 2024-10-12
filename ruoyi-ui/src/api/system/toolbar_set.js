import request from '@/utils/request'

// 查询工具栏配置列表
export function listToolbar_set(query) {
  return request({
    url: '/system/toolbar_set/list',
    method: 'get',
    params: query
  })
}

// 查询工具栏配置详细
export function getToolbar_set(id) {
  return request({
    url: '/system/toolbar_set/' + id,
    method: 'get'
  })
}

// 新增工具栏配置
export function addToolbar_set(data) {
  return request({
    url: '/system/toolbar_set',
    method: 'post',
    data: data
  })
}

// 修改工具栏配置
export function updateToolbar_set(data) {
  return request({
    url: '/system/toolbar_set',
    method: 'put',
    data: data
  })
}

// 删除工具栏配置
export function delToolbar_set(id) {
  return request({
    url: '/system/toolbar_set/' + id,
    method: 'delete'
  })
}
