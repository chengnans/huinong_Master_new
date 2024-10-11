import request from '@/utils/request'

// 查询产业企业列表
export function listEnterprise(query) {
  return request({
    url: '/system/enterprise/list',
    method: 'get',
    params: query
  })
}

// 查询产业企业详细
export function getEnterprise(id) {
  return request({
    url: '/system/enterprise/' + id,
    method: 'get'
  })
}

// 新增产业企业
export function addEnterprise(data) {
  return request({
    url: '/system/enterprise',
    method: 'post',
    data: data
  })
}

// 修改产业企业
export function updateEnterprise(data) {
  return request({
    url: '/system/enterprise',
    method: 'put',
    data: data
  })
}

// 删除产业企业
export function delEnterprise(id) {
  return request({
    url: '/system/enterprise/' + id,
    method: 'delete'
  })
}
