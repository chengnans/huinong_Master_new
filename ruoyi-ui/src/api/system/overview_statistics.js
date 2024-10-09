import request from '@/utils/request'

// 查询概览统计列表
export function listOverview_statistics(query) {
  return request({
    url: '/system/overview_statistics/list',
    method: 'get',
    params: query
  })
}

// 查询概览统计详细
export function getOverview_statistics(id) {
  return request({
    url: '/system/overview_statistics/' + id,
    method: 'get'
  })
}

// 新增概览统计
export function addOverview_statistics(data) {
  return request({
    url: '/system/overview_statistics',
    method: 'post',
    data: data
  })
}

// 修改概览统计
export function updateOverview_statistics(data) {
  return request({
    url: '/system/overview_statistics',
    method: 'put',
    data: data
  })
}

// 删除概览统计
export function delOverview_statistics(id) {
  return request({
    url: '/system/overview_statistics/' + id,
    method: 'delete'
  })
}
