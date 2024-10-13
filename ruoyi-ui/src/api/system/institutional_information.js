import request from '@/utils/request'

// 查询机构信息列表
export function listInstitutional_information(query) {
  return request({
    url: '/system/institutional_information/list',
    method: 'get',
    params: query
  })
}

// 查询机构信息详细
export function getInstitutional_information(id) {
  return request({
    url: '/system/institutional_information/' + id,
    method: 'get'
  })
}

// 新增机构信息
export function addInstitutional_information(data) {
  return request({
    url: '/system/institutional_information',
    method: 'post',
    data: data
  })
}

// 修改机构信息
export function updateInstitutional_information(data) {
  return request({
    url: '/system/institutional_information',
    method: 'put',
    data: data
  })
}

// 删除机构信息
export function delInstitutional_information(id) {
  return request({
    url: '/system/institutional_information/' + id,
    method: 'delete'
  })
}
