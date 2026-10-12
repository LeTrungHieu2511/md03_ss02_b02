package com.example.session02.repository;

import com.example.session02.model.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskRepository {

    private final List<Task> tasks = new ArrayList<>();

    public TaskRepository() {
        tasks.add(new Task(1L, "Viết tài liệu thiết kế", "Soạn file design.md", "high", 1L));
        tasks.add(new Task(2L, "Sửa lỗi đăng nhập", "Lỗi sai mật khẩu vẫn vào được", "high", 2L));
        tasks.add(new Task(3L, "Thiết kế giao diện", "Làm trang danh sách công việc", "medium", 3L));
        tasks.add(new Task(4L, "Viết unit test", "Test cho UserService", "medium", 1L));
        tasks.add(new Task(5L, "Cập nhật README", "Thêm hướng dẫn chạy dự án", "low", 2L));
        tasks.add(new Task(6L, "Tối ưu truy vấn", "Giảm thời gian tải danh sách", "high", 3L));
        tasks.add(new Task(7L, "Review code", "Xem lại pull request của nhóm", "medium", 1L));
        tasks.add(new Task(8L, "Cấu hình CI", "Thiết lập build tự động", "low", 2L));
        tasks.add(new Task(9L, "Sao lưu dữ liệu", "Lên lịch sao lưu hằng tuần", "high", 3L));
        tasks.add(new Task(10L, "Dọn dẹp mã cũ", "Xóa các class không dùng", "low", 1L));
    }

    public List<Task> findAll() {
        return tasks;
    }
}