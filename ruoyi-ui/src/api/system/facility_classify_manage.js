import request from '@/utils/request'

// 查询设施分类管理列表
export function listFacility_classify_manage(query) {
  return request({
    url: '/system/facility_classify_manage/list',
    method: 'get',
    params: query
  })
}

// 查询设施分类管理详细
export function getFacility_classify_manage(id) {
  return request({
    url: '/system/facility_classify_manage/' + id,
    method: 'get'
  })
}

// 新增设施分类管理
export function addFacility_classify_manage(data) {
  return request({
    url: '/system/facility_classify_manage',
    method: 'post',
    data: data
  })
}

// 修改设施分类管理
export function updateFacility_classify_manage(data) {
  return request({
    url: '/system/facility_classify_manage',
    method: 'put',
    data: data
  })
}

// 删除设施分类管理
export function delFacility_classify_manage(id) {
  return request({
    url: '/system/facility_classify_manage/' + id,
    method: 'delete'
  })
}
