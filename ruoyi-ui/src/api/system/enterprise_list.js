import request from '@/utils/request'

// 查询企业列表列表
export function listEnterprise_list(query) {
  return request({
    url: '/system/enterprise_list/list',
    method: 'get',
    params: query
  })
}

// 查询企业列表详细
export function getEnterprise_list(id) {
  return request({
    url: '/system/enterprise_list/' + id,
    method: 'get'
  })
}

// 新增企业列表
export function addEnterprise_list(data) {
  return request({
    url: '/system/enterprise_list',
    method: 'post',
    data: data
  })
}

// 修改企业列表
export function updateEnterprise_list(data) {
  return request({
    url: '/system/enterprise_list',
    method: 'put',
    data: data
  })
}

// 删除企业列表
export function delEnterprise_list(id) {
  return request({
    url: '/system/enterprise_list/' + id,
    method: 'delete'
  })
}
