package com.rabtman.acgclub.di.module;

import com.rabtman.acgclub.mvp.contract.ScheduleDetailContract;
import com.rabtman.acgclub.mvp.model.ScheduleDetailModel;
import com.rabtman.common.di.scope.ActivityScope;
import dagger.Module;
import dagger.Provides;

/**
 * @author Rabtman
 */
@Module
public class ScheduleDetailModule {

  private ScheduleDetailContract.View view;

  public ScheduleDetailModule(ScheduleDetailContract.View view) {
    this.view = view;
  }

  @ActivityScope
  @Provides
  ScheduleDetailContract.View providerScheduleDetailView() {
    return this.view;
  }

  @ActivityScope
  @Provides
  ScheduleDetailContract.Model providerScheduleDetailModel(ScheduleDetailModel model) {
    return model;
  }
}
