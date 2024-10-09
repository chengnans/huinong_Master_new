import request from '@/utils/request'

// 查询农作物监测报表列表
export function listCrop_report(query) {
  return request({
    url: '/system/crop_report/list',
    method: 'get',
    params: query
  })
}

// 查询农作物监测报表详细
export function getCrop_report(id) {
  return request({
    url: '/system/crop_report/' + id,
    method: 'get'
  })
}

// 新增农作物监测报表
export function addCrop_report(data) {
  return request({
    url: '/system/crop_report',
    method: 'post',
    data: data
  })
}

// 修改农作物监测报表
export function updateCrop_report(data) {
  return request({
    url: '/system/crop_report',
    method: 'put',
    data: data
  })
}

// 删除农作物监测报表
export function delCrop_report(id) {
  return request({
    url: '/system/crop_report/' + id,
    method: 'delete'
  })
}
