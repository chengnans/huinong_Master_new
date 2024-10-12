import request from '@/utils/request'

// 查询设施列表列表
export function listFacility_list(query) {
  return request({
    url: '/system/facility_list/list',
    method: 'get',
    params: query
  })
}

// 查询设施列表详细
export function getFacility_list(id) {
  return request({
    url: '/system/facility_list/' + id,
    method: 'get'
  })
}

// 新增设施列表
export function addFacility_list(data) {
  return request({
    url: '/system/facility_list',
    method: 'post',
    data: data
  })
}

// 修改设施列表
export function updateFacility_list(data) {
  return request({
    url: '/system/facility_list',
    method: 'put',
    data: data
  })
}

// 删除设施列表
export function delFacility_list(id) {
  return request({
    url: '/system/facility_list/' + id,
    method: 'delete'
  })
}
